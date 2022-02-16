package kr.co.mlec.fileupload;

import java.io.File;
import java.util.UUID;

import com.oreilly.servlet.multipart.FileRenamePolicy;

public class MlecFileRenamePolicy implements FileRenamePolicy {
	public static void main(String[] args) {
		File f = new File("c:/java/upload/board/2019/09/18/11/test.jpg");
		System.out.println(f.getParent());
		String name = f.getName();
		int index = name.lastIndexOf(".");
		String extName = "";
		if (index != -1) extName = name.substring(index);
		System.out.println(UUID.randomUUID().toString() + extName);
		
		System.out.println(name);
		System.out.println(index);
	}
	
	@Override
	public File rename(File f) {
		String name = f.getName();
		int index = name.lastIndexOf(".");
		String extName = "";
		if (index != -1) extName = name.substring(index);
		return new File(f.getParent(), UUID.randomUUID().toString() + extName);
	}
}











