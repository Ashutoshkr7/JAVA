/*
 * Solid principles
 * Solid is an acronym for the first five Object Oriented design (OOD)
 * S -
 * O -
 * L -
 * I -
 * D - dependency inversion principle - high level module should not directly depend on the low level modules, instead should depend on the abstractions
 */

package violations;
//In this example the high level module is directly dependent on the low level module,
//Which is the violation of solid principle

class MyMessenger {//Application Layer : High Level Module
    TCPProtocolHandler tcpHandler = new TCPProtocolHandler();

    public void send(String to, String message) {
        tcpHandler.sendMessage("message to - "+ to + ", message - " + message);
    }
}

//Transport Layer : Low level module
class TCPProtocolHandler {
    public void sendMessage (String message) {
        System.out.println("TCPProtocolHandler sending message - " + message);
    }
}

public class SolidDViolation {
    public static void main(String[] args) {
        MyMessenger messenger = new MyMessenger();
        messenger.send("a", "Hello a");
    }
}
