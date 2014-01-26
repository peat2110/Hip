package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import views.html.*;
import views.html.iframe.*;
public class BrownPeterson extends Controller {
    
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
}
