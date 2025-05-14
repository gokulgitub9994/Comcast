package MultiThreading;

	import java.io.File;
	import java.io.FileWriter;
	import java.io.FileReader;
	import java.io.IOException;
	public class FileHandling {
		public String filePath="C:\\Filehandling\\data.txt";
		public File file;
		public FileWriter fileWriter;
		public FileReader fileReader;
		String data="Hello world";
		
		public void createFile()
		{
			file=new File(filePath);
			try {
				boolean data=file.createNewFile();
				if(data)
				{
					System.out.println("File created");
				}
				else {
					System.out.println("File already Exists");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void updateFile()
		{
			try {
				fileWriter=new FileWriter(file);
				fileWriter.write(data);
				fileWriter.close();
				System.out.println("File Updated");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void readFile()
		{
			int i;
			try {
				fileReader=new FileReader(file);
				while((i=fileReader.read())!= -1)
				{
					System.out.print((char)i);
				}
				fileReader.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void deleteFile() {
			file =new File(filePath);
			boolean data=file.delete();
			if(data)
			{
				System.out.println("File deleted");
			}
			else {
				System.out.println("File doesn't exists");
			}
		}
		
	}

