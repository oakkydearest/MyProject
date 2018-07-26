package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(home.render());
    }

    public static Result lab2() {
        return ok(lab2.render());
    }
    public static Result lab3() {
        return ok(lab3.render());
    }
    public static Result lab2_page2() {
        return ok(lab2_page2.render());
    }






    public static Result home(){return ok(home.render()); }

}
