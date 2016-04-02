/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mail;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Adil
 */
public class Javamail {
    public static void main(String[] args) throws Exception {

    Properties props = new Properties();
    props.setProperty("mail.smtp.host", "127.0.0.1");
    //props.put("mail.host", "mail.cloud9.net");
// props.put("mail.smtp.host", "smtp.gmail.com");
//       props.put("mail.smtp.socketFactory.port", "587");
//       props.put("mail.smtp.socketFactory.class", "Javax.net.ssl.SSLSocketFactory");
//       props.put("mail.smtp.auth", "true");
//       props.put("mail.smtp.port", "587");     
   try{
    Session mailConnection = Session.getInstance(props);
    Message msg = new MimeMessage(mailConnection);

    Address a = new InternetAddress("adil_abdullah@hotmail.com");
    Address b = new InternetAddress("adil.officer@gmail.com");

    msg.setContent("Mail contect", "text/plain");
    msg.setFrom(a);
    msg.setRecipient(Message.RecipientType.TO, b);
    msg.setSubject("subject");

    Transport.send(msg);
    JOptionPane.showMessageDialog(null,"Send Successfully");
  }
    catch(Exception ex)
    {ex.printStackTrace();
    JOptionPane.showMessageDialog(null,ex.getMessage());}
    }
    
}
