package jm.carrot.controller.userController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(name="샘플 컨트롤러입니다.")
@RestController
public class UserController {

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

    @GetMapping("/user/name")
    public String userName(){

        return "user";
    }
}
