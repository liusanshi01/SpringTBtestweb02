package cn._4para.control;

import cn._4para.bo.Label;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//类注解 @RestController
//我们只需要在类上写上注解 @RestController，那么此Controller返回格式就都是text/json。
//方法注解 @ResponseBody
//我们只需要在某个方法上写上注解 @ResponseBody，那么该方法返回格式是text/json。如下图
//虽然都是都可以，但我更推荐第一种使用类注解，会显得我们的编码风格十分统一，代码更加紧凑
@RestController
@RequestMapping("/api")
public class webClient {
    public static Logger logger = Logger.getLogger(webClient.class);
//    private final String TARGET_HOST = "http://localhost:8080";
//    private WebClient webClient;

//    GetMapping
//    客户端只能用 GET 方式请求，适用于查询数据
//    @GetMapping("/gethello")
//    public String helloworld(){
//        return "helloworld";
//    }
//
////    @PostMapping
////    客户端只能用 POST方式请求，适用于提交数据。
//
//    @PostMapping("/posthello")
//    public String getpost(){
//        return "helloworld";
//    }
////    @DeleteMapping
////    客户端只能用 DELETE方式请求，使用于删除数据。
//
//
//    //在RequestMapping的源码中提到，这种支持任意请求方式，类似于自适应。所以感觉这个是万能
//    //1.1param使用方式
//    @RequestMapping("/getinfo")
//    public String getInfo(@RequestParam(name = "param",
//            required = false,
//            defaultValue = "param dafault value") String param){
//        return param;
//    }
//    //1.2param使用方式
//    @RequestMapping("/getinfo/{param}")
//    public String getInf2(@PathVariable("param") Object param){
//        return param.toString();
//    }
//
//    //真正使用太保的方式
//    @RequestMapping(value = "/predictor2", method = RequestMethod.POST)
//    public String getLabel2(HttpServletRequest req) {
//                         //HttpServletRequest request
//        String result=req.getParameter("strJson");
//        return result;
//    }


    //实例用法种一种
    @RequestMapping(value = "/predictor", method = RequestMethod.POST)
    public String getLabel(@RequestBody Label label) {
        //正确的访问返回
        if (label.getId()!=null && label.getLabel() !=0) {

            logger.info("{" +
                    "\"id\" : "+label.getId()+" ," +
                    " \"label\" : "+label.getLabel()+ "}");

            return "{" +
                "\"status\" : 0 , \"msg\" : \"\""
                + '}';
        }else {
            return "{" +
                    "\"status\" : -1 , \"msg\" : \"label is null!\""
                    + '}';
        }
    }

    //实例用法第二种


    //测试1-houxu
//    @RequestMapping(value = "/hello2", method = RequestMethod.POST)
//    public void testPostJson(String strjson){
////        Label user =new Label();
//
//        Mono<String> response = WebClient.create().post().uri("localhost:8080/bypost2")
//                .contentType(MediaType.APPLICATION_JSON_UTF8)
//                .body(Mono.just(strjson),strjson)
//                .retrieve()
//                .bodyToMono(String.class);
////                .timeout(Duration.of(10, ChronoUnit.SECONDS));
//
//        System.out.println("result:{},"+response.block());
//    }
}