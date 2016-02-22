package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
import models.*;
import play.libs.Json;
import play.mvc.*;
import util.Common;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Named
@Singleton
public class PostController extends Controller{
    private final PostRepository postRepository;
    private final ClimateServiceRepository climateServiceRepository;
    private final UserRepository userRepository;

    @Inject
    public PostController(PostRepository postRepository
        ,ClimateServiceRepository climateServiceRepository
        ,UserRepository userRepository){

        this.postRepository = postRepository;
        this.climateServiceRepository = climateServiceRepository;
        this.userRepository = userRepository;

    }

    public Result getAllPosts(String format) {
        Iterable<Post> posts = postRepository
                .findAll();
        if (posts == null) {
            System.out.println("No Posts found");
        }

        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(posts);
        }

        return ok(result);
    }

    public Result createPost(){
//        System.out.println("Body:" + request().body());
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out
                    .println("Post not saved, expecting Json data");
            return badRequest("Post not saved, expecting Json data");
        }
        System.out.println("59:");
        // Parse JSON file
//        long postId = json.findPath("postId").asLong();
        String comment = json.findPath("comment").asText();
        String userEmail = json.findPath("userEmail").asText();
        String atService = json.findPath("atService").asText();
        long climateId = json.findPath("climateId").asLong();
        double grade = json.findPath("grade").asDouble();
        System.out.println("66:" + comment + userEmail + climateId + grade);
        Long createTime = Long.parseLong(json.findPath("createTime").asText());
//        SimpleDateFormat format = new SimpleDateFormat(Common.DATE_PATTERN);
        System.out.println("75:" + comment + userEmail + climateId + grade + createTime);
        try {
            User user = userRepository.findByEmail(userEmail);
            ClimateService climateService = climateServiceRepository
                    .findOne(climateId);
            int postNum = climateService.getPostNum();
            double oldGrade = climateService.getGrade();

            // Update the postNum and grade
            if(grade != 0) {
                climateService.setPostNum(postNum + 1);
                climateService.setGrade((oldGrade + grade) / (postNum + 1));
            }
            String email = "Guest";
            if (user != null) {
                email = user.getUserName();
            }
            Post post = new Post( comment,createTime, email , grade, climateService.getName(),climateId);
            post.setAtClimateService(atService);
            System.out.println("atServiceatService:" + atService);
            postRepository.save(post);
            climateServiceRepository.save(climateService);
            return created(new Gson().toJson(post));

        } catch (PersistenceException pe) {
            pe.printStackTrace();
            System.out.println("Post not saved comment: " + comment);
            return badRequest("Post not saved comment: " + comment);
        }
    }

//    public Result getAllAtClimateServices(String name, String format) {
//
//
//
//        Iterable<Post> posts = postRepository
//                .findAllByAtClimateService(name);
//        if (posts == null) {
//            System.out.println("No Posts found");
//        }
//
//        String result = new String();
//        if (format.equals("json")) {
//            result = new Gson().toJson(posts);
//        }
//
//        return ok(result);
//    }
    public Result getAllAtClimateServices() {
        JsonNode json = request().body().asJson();

        String name = json.path("name").asText();
        System.out.println();
        System.out.println("AT CALLED");
        System.out.println("name = " + name);

        Iterable<Post> posts = postRepository
                .findAllByAtClimateService(name);
        if (posts == null) {
            System.out.println("No Posts found");
        }

        String result = new String();
        result = new Gson().toJson(posts);
        System.out.println();
        System.out.println("result = " + result);

        return ok(result);
    }
}
