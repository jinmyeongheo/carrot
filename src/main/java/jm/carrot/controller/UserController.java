package jm.carrot.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jm.carrot.dto.request.SignInRequest;
import jm.carrot.dto.response.ApiResponse;
import jm.carrot.entity.User;
import jm.carrot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name="회원가입")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    // 회원가입
    @PostMapping("/sign-in")
    public ResponseEntity<ApiResponse> signIn(@RequestBody SignInRequest signInRequest){
        User build = User.builder().mobileNumber(signInRequest.getMobileNumber()).build();
        userRepository.save(build);
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.createSuccessWithNoContent());
    }

    @Operation(summary = "get test api summary", description = "[@Operation] get test api")
    @GetMapping("/get/{id}")
    public String getTest1(
            @Parameter(name = "id", description = "아이디값", example = "예시")
            @PathVariable String id,
            @RequestParam(value = "q", defaultValue = "default", required = false) String queryParam
    ) {

        return id + queryParam;
    }


    @Operation(summary = "요약요약~~!!", description = "설명을 자세하게 해보아보아요오~~!!")
    @GetMapping("/happy")
    public String test1(){
        return "hello";
    }
}
