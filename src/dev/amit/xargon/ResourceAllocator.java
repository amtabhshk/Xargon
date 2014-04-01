package dev.amit.xargon;

import java.net.URL;

/**
 * @author Bapu
 *
 */
public class ResourceAllocator {
	
	public static ResourceAllocator rl=new ResourceAllocator();
		public static URL getFile(String filename){
			return rl.getClass().getResource(""+filename);
		}	
}
