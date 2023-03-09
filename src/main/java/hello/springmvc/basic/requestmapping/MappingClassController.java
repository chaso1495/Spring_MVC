package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

/*회원 목록 조회: GET
회원 등록: POST
회원 조회: GET
회원수정: PATCH /users/{userId}
회원 삭제: DELETE /users/{userId}*/

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    /**
     * GET /mapping/users
     */
    @GetMapping // 회원 목록 조회: GET
    public String users() {
        return "get users";
    }

    /**
     * POST /mapping/users
     */
    @PostMapping // 회원 등록: POST
    public String addUser() {
        return "post user";
    }

    /**
     * GET /mapping/users/{userId}
     */
    @GetMapping("/{userId}") // 회원 조회: GET
    public String findUser(@PathVariable String userId) {
        return "get userId=" + userId;
    }

    /**
     * PATCH /mapping/users/{userId}
     */
    @PatchMapping("/{userId}") // 회원 수정: PATCH /users/{userId}
    public String updateUser(@PathVariable String userId) {
        return "update userId=" + userId;
    }

    /**
     * DELETE /mapping/users/{userId}
     */
    @DeleteMapping("/{userId}") // 회원 삭제: DELETE /users/{userId}
    public String deleteUser(@PathVariable String userId) {
        return "delete userId=" + userId;
    }
}
