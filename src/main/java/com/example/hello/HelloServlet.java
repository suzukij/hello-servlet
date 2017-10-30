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
		pw.print("\n" +
				"\n" +
				"                             @@@\n" +
				"                             @@@\n" +
				"                              @@@                       H A P P Y\n" +
				"                              @@@\n" +
				"                      @@@@@@@@@@@@@@@@@@@@@@         H A L L O W E E N\n" +
				"                    @@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
				"                  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
				"                @@@@@@@@ @@@@@@@@@@@@@@@@ @@@@@@@@\n" +
				"              @@@@@@@@@   @@@@@@@@@@@@@@   @@@@@@@@@\n" +
				"            @@@@@@@@@@     @@@@@@@@@@@@     @@@@@@@@@@\n" +
				"           @@@@@@@@@@       @@@@  @@@@       @@@@@@@@@@\n" +
				"           @@@@@@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@@@@@\n" +
				"           @@@@@@@@@@@@@@@@@@        @@@@@@@@@@@@@@@@@@\n" +
				"           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
				"           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
				"           @@@@@@@@@ @@@@@@@@@@@@@@@@@@@@@@@@ @@@@@@@@@\n" +
				"            @@@@@@@@  @@ @@ @@ @@ @@ @@ @@ @  @@@@@@@@\n" +
				"              @@@@@@@                        @@@@@@@\n" +
				"                @@@@@@  @@ @@ @@ @@ @@ @@ @ @@@@@@\n" +
				"                  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
				"                    @@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
				"                      @@@@@@@@@@@@@@@@@@@@@@");
		pw.flush();
	}
}