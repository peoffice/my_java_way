package mark.java_demo;

import com.sun.jna.Callback;

public interface Example22CallbackInterface extends Callback {
	void invoke(int val);
}
