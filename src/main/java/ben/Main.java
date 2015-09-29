package ben;

import com.jogamp.newt.event.WindowAdapter;
import com.jogamp.newt.event.WindowEvent;
import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.FPSAnimator;

public class Main {

    public static void main(String[] args) {
        GLProfile glp = GLProfile.get("GL3");

        GLCapabilities caps = new GLCapabilities(glp);

        GLWindow glWindow = GLWindow.create(caps);
        glWindow.setSize(800, 600);
        glWindow.setVisible(true);

        glWindow.addWindowListener(new WindowAdapter() {
            public void windowDestroyNotify(WindowEvent e) {
                System.exit(0);
            }
        });

        FPSAnimator animator = new FPSAnimator(glWindow, 60);
        animator.start();
    }
}
