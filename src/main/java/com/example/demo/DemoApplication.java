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
		deCodeFile(profiles);
	}

	public static void deCodeFile(String fileName) {
		File file = new File(fileName);

		b tt = new b();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line + "----->" + tt.a(line));
			}
		} catch (IOException e) {
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
				}
			}

		}
	}

}
