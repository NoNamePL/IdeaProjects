package springboot.topjava.ru;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final String sharedKey = "SHARED_KEY";

    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;

    @GetMapping
    public BaseResponse showStatus() {
        return new BaseResponse(SUCCESS_STATUS,1);
    }

    @PostMapping("/pay")
    public BaseResponse pay(@RequestParam(value = "key"),Strin key @RequestBody PaymentRequest request) {
        
    }

}
