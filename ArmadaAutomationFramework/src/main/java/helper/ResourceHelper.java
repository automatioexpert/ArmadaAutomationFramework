package helper;

public class ResourceHelper {

	public static String getResourcePath(String path) {
		String basePath = System.getProperty("user.dir");
		return basePath + path;
	}

	public static void main(String[] args) {
		
		String path=getResourcePath("\\src\\test\\resources");
		System.out.println(path);
		
	}
}
