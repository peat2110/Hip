package controllers;

import models.brownPeterson.Question;
import models.brownPeterson.Quiz;
import play.*;
import play.mvc.*;
import play.data.*;
import views.html.*;
import views.html.iframe.*;

import models.*;
import java.util.List;
import models.brownPeterson.*;

public class BrownPeterson extends Controller {
    public static Form<Answer> ansForm = Form.form(Answer.class);

        int count = 0;

        public static Result renderShortTermMemoryBrownPetersonTask(){
            return ok(brown_peterson_info.render());
        }

        public static Result renderShortTermMemoryBrownPetersonTaskIframe(){
            return ok(brown_peterson_iframe.render());
        }
        public static Result renderShortTermMemoryBrownPetersonTaskProc(){
            return ok(brown_peterson_proc.render());
        }
        public static Result renderShortTermMemoryBrownPetersonTaskProcIframe(){
            return ok(brown_peterson_proc_iframe.render());
        }
        public static Result renderShortTermMemoryBrownPetersonTaskExp(){
            List<Question> questions = Question.getQuestionListBy(3);
            return ok(brown_peterson_exp.render(questions,1200,ansForm));
        }
}
