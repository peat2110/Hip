package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import views.html.*;
import views.html.iframe.*;
public class Application extends Controller {

    public static Result index() {
        return ok(views.html.index.render());
    }

    public static Result perceptionSignalDetection(){
        return ok(views.html.signal_detection_info.render());
    }

    public static Result perceptioniChangeBlindness(){
        return ok(views.html.change_blindness_info.render());
    }

    public static Result home(){
        Form<User> userForm = Form.form(User.class);
        User user = userForm.bindFromRequest().get();
        
        if(user.username.equals("TDM") && user.password.equals("Dark")){
            return ok(home.render(user));
        }
        else return redirect(routes.Application.index());
    }

}
