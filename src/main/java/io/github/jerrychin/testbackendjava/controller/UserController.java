package io.github.jerrychin.testbackendjava.controller;


import io.github.jerrychin.testbackendjava.model.dto.UserDTO;
import io.github.jerrychin.testbackendjava.model.vo.UserVO;
import io.github.jerrychin.testbackendjava.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
@Api(tags="User Management")
@Slf4j
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation("Get User")
    @GetMapping("/{id}")
    public UserVO getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

    @ApiOperation("Create User")
    @PostMapping("")
    public UserVO createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @ApiOperation("Update User")
    @PutMapping("/{id}")
    public UserVO updateUser(@PathVariable String id, @RequestBody UserDTO userDTO) {
       return userService.updateUser(id, userDTO);
    }

    @ApiOperation("Delete User")
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }

}