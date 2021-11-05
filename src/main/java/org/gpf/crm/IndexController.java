package org.gpf.crm;

import org.gpf.crm.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController {
    /**
     * 系统登录页面
     *
     * @return
     */
    @RequestMapping("index")
    public String index() {
        return "index";
    }

    /**
     * 系统欢迎页面
     *
     * @return
     */
    @RequestMapping("welcome")
    public String welcome() {

        return "welcome";
    }

    /**
     * 后端管理页面
     *
     * @return
     */
    @RequestMapping("main")
    public String main() {
        return "main";
    }
}
