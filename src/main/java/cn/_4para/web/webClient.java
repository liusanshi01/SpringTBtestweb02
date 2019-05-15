//package cn._4para.web;
//
//import cn._4para.bo.Label;
//import org.junit.Test;
//import org.springframework.http.MediaType;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;
//
//public class webClient {
////            private WebClient webClient = WebClient.builder()
////            .baseUrl("http://127.0.0.1:8080")
////            .defaultHeader(HttpHeaders.USER_AGENT,"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko)")
////            .defaultCookie("ACCESS_TOKEN", "test_token").build();
//
//
//    /**
//     * 测试POST传JSON请求（使用json字符串）
//     */
//    @Test
//    public void testPostJson(){
//        Label user =new Label();
//
//        Mono<String> response = WebClient.create().post().uri("localhost:8080/bypost2")
//                .contentType(MediaType.APPLICATION_JSON_UTF8)
//                .body(Mono.just(user),Label.class)
//                .retrieve()
//                .bodyToMono(String.class);
////                .timeout(Duration.of(10, ChronoUnit.SECONDS));
//
//
//        System.out.println("result:{},"+response.block());
//    }
//}
