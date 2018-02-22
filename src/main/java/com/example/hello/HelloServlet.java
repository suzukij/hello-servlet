package com.example.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "hello", urlPatterns = "/")
public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/plain;charset=utf-8");
		PrintWriter pw = res.getWriter();
		pw.println("/$$   /$$           /$$ /$$                  /$$$$$$  /$$$$$$$  /$$$$$$$   /$$$$$$  /$$");
		pw.println("| $$  | $$          | $$| $$                 /$$__  $$| $$__  $$| $$__  $$ /$$__  $$| $$");
		pw.println("| $$  | $$  /$$$$$$ | $$| $$  /$$$$$$       | $$  \\__/| $$  \\ $$| $$  \\ $$| $$  \\__/| $$");
		pw.println("| $$$$$$$$ /$$__  $$| $$| $$ /$$__  $$      |  $$$$$$ | $$$$$$$ | $$$$$$$/|  $$$$$$ | $$");
		pw.println("| $$__  $$| $$$$$$$$| $$| $$| $$  \\ $$       \\____  $$| $$__  $$| $$____/  \\____  $$|__/");
		pw.println("| $$  | $$| $$_____/| $$| $$| $$  | $$       /$$  \\ $$| $$  \\ $$| $$       /$$  \\ $$    ");
		pw.println("| $$  | $$|  $$$$$$$| $$| $$|  $$$$$$/      |  $$$$$$/| $$$$$$$/| $$      |  $$$$$$/ /$$");
		pw.println("|__/  |__/ \\_______/|__/|__/ \\______/        \\______/ |_______/ |__/       \\______/ |__/");
		pw.flush();
	}
}