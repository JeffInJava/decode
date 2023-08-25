package com.example.demo;

import a.a.b;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.*;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {

		/*String code = "";
		do{
			code = scan.nextLine();
			if(code.length()!=8){
				System.out.println("字符："+code+"长度应为8位，请重新输入：");
			}
		}while(code.length()!=8);*/
		String code = args[0];
		if(code.length()!=8){
			System.out.println("Error!");
			return;
		}
		b tt = new b();
		System.out.println(code + "," + tt.a(code)+","+tt.a(code)+"\n");
	}

	public static void deCodeFile(String fileName,String writerFile) {
		File file = new File(fileName);

		b tt = new b();
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			writer = new BufferedWriter(new FileWriter(writerFile));
			String line = null;
			StringBuffer sbstr = new StringBuffer("");
			int lineNum = 0;
			while ((line = reader.readLine()) != null) {
				lineNum++;
				//System.out.println(line + "----->" + tt.a(line));
				if(line.length()!=8){
					System.out.println("第"+lineNum+"行：["+line+"]字符长度不正确！");
					return;
				}
				sbstr.append(line + "," + tt.a(line)+","+tt.a(line)+"\n");
			}
			writer.write(sbstr.toString());
			writer.flush();
			System.out.println("已生成文件："+writerFile);
		} catch (IOException e) {
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
					writer.close();
				} catch (IOException e) {
				}
			}

		}
	}

}
