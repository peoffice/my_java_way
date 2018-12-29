package mark.workspace.memory_leak;
import com.sun.jna.Library;
import com.sun.jna.Native;

public class AlgProxy{
	public interface AlgDll extends Library{
		@SuppressWarnings("deprecation")
		AlgDll Instance = (AlgDll)Native.loadLibrary("memory_leak",AlgDll.class);
		
		public void memory_leak(MyBlock.ByReference block);
	}
}
