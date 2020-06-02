package serviece;

import model.EmailSetting;

import java.util.ArrayList;
import java.util.List;

public class MailServiece {
    public static EmailSetting emailSetting;
    public static EmailSetting defaultSetting() {
        emailSetting = new EmailSetting("English", 25, false, "thor");
        return emailSetting;
    }
    public EmailSetting save(EmailSetting email){
        emailSetting = email;
        return emailSetting;
    }
}
