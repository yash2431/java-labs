interface EventListener {
    void performEvent();
}


interface MouseListener extends EventListener {
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}


interface KeyListener extends EventListener {
    void keyPressed();
    void keyReleased();
}


class EventDemo implements MouseListener, KeyListener {

    @Override
    public void mouseClicked() {
        System.out.println("Mouse clicked");
    }

    @Override
    public void mousePressed() {
        System.out.println("Mouse pressed");
    }

    @Override
    public void mouseReleased() {
        System.out.println("Mouse released");
    }

    @Override
    public void mouseMoved() {
        System.out.println("Mouse moved");
    }

    @Override
    public void mouseDragged() {
        System.out.println("Mouse dragged");
    }


    @Override
    public void keyPressed() {
        System.out.println("Key pressed");
    }

    @Override
    public void keyReleased() {
        System.out.println("Key released");
    }

    @Override
    public void performEvent() {
        System.out.println("Event performed");
    }
}


public class EventManage {
    public static void main(String[] args) {
        EventDemo eventDemo = new EventDemo();

        eventDemo.mouseClicked();
        eventDemo.mousePressed();
        eventDemo.mouseReleased();
        eventDemo.mouseMoved();
        eventDemo.mouseDragged();

        eventDemo.keyPressed();
        eventDemo.keyReleased();

        eventDemo.performEvent();
    }
}
