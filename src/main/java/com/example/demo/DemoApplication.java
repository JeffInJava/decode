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

	public static void main(String[] args) {
		System.out.println("请输入文件路径：");
		Scanner scan = new Scanner(System.in);
		String profiles = scan.nextLine();
		String[] wls = profiles.split("\\.");
		if(wls.length!=2){
			System.out.println("文件路径格式不正确！");
			return ;
		}
		String writerFile = wls[0]+"_gen.txt";
		deCodeFile(profiles,writerFile);
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
			while ((line = reader.readLine()) != null) {
				//System.out.println(line + "----->" + tt.a(line));
				sbstr.append(line + "----->" + tt.a(line)+"\n");
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
