/*
 * Solid principles
 * Solid is an acronym for the first five Object Oriented design (OOD)
 * S -
 * O -
 * L -
 * I -
 * D - dependency inversion principle - high level module should not directly depend on the low level modules, instead should depend on the abstractions
 */
package nonViolations;

class MyMessenger {//Application Layer : High Level Module
    ProtocolHandler handler;

    MyMessenger(String protocol) {//MyMessenger is not directly dependent on the TCPHandler or the UDPHandler
        handler = ProtocolHandlerFactory.getProtocolHandler(protocol);
    }

    public void send(String to, String message) {
        handler.sendMessage("message to - "+ to + ", message - " + message);
    }
}

interface ProtocolHandler {
    void sendMessage(String message);
}

//Transport Layer : Low level module
class TCPProtocolHandler implements ProtocolHandler{
    public void sendMessage (String message) {
        System.out.println("TCPProtocolHandler sending message - " + message);
    }
}

//UDP Layer : Low level module
class UDPProtocolHandler implements ProtocolHandler{
    public void sendMessage (String message) {
        System.out.println("UDPProtocolHandler sending message - " + message);
    }
}

class ProtocolHandlerFactory  {
    public static ProtocolHandler getProtocolHandler(String protocol) {
        if("TCP".equalsIgnoreCase(protocol)) {
            return new TCPProtocolHandler();
        }

        if("UDP".equalsIgnoreCase(protocol)) {
            return new UDPProtocolHandler();
        }

        return null;
    }
}

public class SolidD {

    public static void main(String[] args) {
        MyMessenger tcpMessenger = new MyMessenger("TCP");
        tcpMessenger.send("a", "Hello a");

        MyMessenger udpMessenger = new MyMessenger("UDP");
        udpMessenger.send("b", "Hello b");
    }
}
