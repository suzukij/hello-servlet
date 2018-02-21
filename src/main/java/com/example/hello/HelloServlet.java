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
		pw.print("i`it)v|[[[[(//s+)`(-\\\\/JJgbdd@@@@@@@dmKK(c!(/-[2=/cct/!-v\\!_L\\)|\n" +
				"]-!/(!-)\\L\\)v|c5(!,!Ldd@@@@@@@@@@@@@@@@@@@dK/]!c\\\\\\v|i\\/cT\\v((c-\n" +
				"]!`/v\\//(-|t\\VvcL!m@@@@@M@@@@@@@@@@@@@@@@@@@@bLt\\\\|)c/2-vv)/it\\.\n" +
				"--/-,\\,\\v\\,|)/v/m@@@@@@K@@@@@@@@@@@@@@@@@@@@@@@bK!v!-( )-!.[/cT\n" +
				"//.\\--'--|-/c(e@@@@@@@DD@@@@@@@@@@@@@@@@@@@@@@@@@@s\\\\\\\\-||/v!c\\.\n" +
				"-,-|\\`||\\-\\/id@@@@@@@@N@@@@@@@@@@@@@@@@@@@@@@@@@@@@b.),`-,-/c-`i\n" +
				"!,\\!-!-!'!-!d@@@@@@@P[+~**AAA@@@@@@@@@@@@@@@@@@@@@@@b/./`c-/.\\7-\n" +
				"--'.-- -/,id@@@*P!`          \\'Z8@@@@@@@@@@@@@@@@@@@@@i.\\\\'.\\.c\n" +
				"',`,`\\'-,-J@@5`-           -- `-iYA@@@@@@@@@@b@@@@@@@@@_\\-|-\\c-\n" +
				"'. -.,`/.G@@K- `               - )7KM@@@@@@@@@@@@@@@@@@@c-----/\n" +
				"- `-  --i@@Ai                    -!ZZ@@@@@@@@@@@@@@@@@@@b! \\`|-`\n" +
				" `-,'- G@@@[,                    '.D8K@@@@@@@@@@@@@@@@@@@[/-,-/.\n" +
				"-` .-/v@@@A)                      -)ZdMd@@@@@@@@@@@@@@@@@@\\' _\\\n" +
				"- ` ,iVJ@@@!                     '-!(K5K@@@@@@@@@@@@@@@@@@[(/s[.\n" +
				"  - i\\G@@@Z-                    ' ! -i55ZZ@@@@@@@@@@@@@@@@@)(4)`\n" +
				" , -|b@@@@!\\                     '  ` |-tYG@@@@@@@@@@@@@@@@XNYZ-\n" +
				"   tt@@@@A-,                        '  `)(d@@@@@@@@@@@@@@@@D)8A[\n" +
				"   )8@@@@@\\                         ,-'-/Kd@@@@@@@@@@@@@@@@@KD@[\n" +
				"  ]]Z@@@@d|-              ,ii.c,, -.icLZKK@@@@@@8@K@@@@@@@@@(@8[\n" +
				"  KN8@@@@@( .i!vGG_      J4Kb8ZKb@bbK@d@88@@@@@@@b@@@@@@@@@@dK@-\n" +
				" )/8K@@@K@b@dP~~~T4(    Jd@@7`___s@M@@@@MM8d@@@d@@@@@@@@@@@@LM8[\n" +
				"\\!48@K@@@@8@@d*@@@bVi   bAKLY~~@@@@@@*ff/\\NM8@@@@@@@@@@@@@@@db@[\n" +
				",\\\\Kb@@@d@.~t` !*~!`.  -MA)    '~'.).` `,'K@@@@@@@@@@@@@@@@@AKb[\n" +
				",`8M@@@@@@ -`,,gvZ``    A//-  ..c\\+\\`    i]d@@@@@@M@@@@@@@@@@@8[\n" +
				"i\\@8@K@@@D              \\!'             !iZ8@@@8A@@@@@8d@b@@@8M[\n" +
				"e8d5@@@@@@             '!-             '-)8@@@@@@@@@@@@@@@@@@M8i\n" +
				"8dZ8@M@@@@-             v  ,          ,\\tK@@@@@@@@@@@@A@@@@@@Z2|\n" +
				"@b@AK@@@b@[              //           cctbA@@@AK@@d@@d@@@K@@@bmi\n" +
				"@@8@M@8@@@P-            -=/.         /iD8d@@@@@@@@@@@@@@A@@@d@@[\n" +
				"@8@@@MA@@@@\\-      .   _)g2i        -((dKK@@@@@d@@@@d@@K@@@@@@K[\n" +
				"@@@bAK@@K@@)i     'c,,Kb@@bK       )X)Kb@M@@d@@@Mb@@A@d@@@@@@8@[\n" +
				"@K@b@@@@A@AA/i-     ~M@@@@Mc    .,\\c=)D8d@@b@@@d@@@@@@@@@@8d@@A[\n" +
				"@@@@Mb@@@@@@('c\\`     PPK((,i]v|-\\-v)8XNAdMK@@@@@@@b@@MK@A@@@@@[\n" +
				"@@8@@MK@d@A@L!--c)s_, ,(ZsbLb@\\`- .-N]/KM@@@@@@@d@@@A@@@@@@@@d@[\n" +
				"@@Kb@@@K@b@@@/-  !''~~Vff*N5f -` -,\\))KK@@@@@@@MK@@d@@@M8d@b@@@[\n" +
				"@b@@@KAK@@@@@@2--    ,,_JJ/i)/- |/v)NK@8d@@@@@@@@@@8@@@@@@@@M@K[\n" +
				"@@8d@K@@@b@@@@@d!,   'VV\\)\\\\)\\7(-)4Jb@8@A@@@K@d@@@@@@@8@@@@@@@@[\n" +
				"M@@@@8@@K@Kb@@@d@v.       `-\\\\/v)88b@M@A@K@@M@@@A@@M@8@@A@d@8@M[\n" +
				"Zb@d@M@K@@@@@@@@@@m       -)!/stbb@b@@A@b@@@@@Kb@@@@@@@b@@@K@@@[\n" +
				"K@@d@@@@@d@M@8@@@@@Ks   ,-/vJD@@8d@K@@@@@@8@@@@@@@@@@MK@@@b@@M@[\n" +
				"tN@b@@d@d@M@@@@@@@@@@LL4JKd@A@@d@@K@@@@MK@@@@8@@@@@@@@@@@b@@@@@[\n" +
				")NM@8b@@A@@@A@@@@@@@@@@@@@@A@@A@@8@@K@d@@@@M@@K@@K@A@@@8@@M@@@@[\n" +
				"(tMM@@@d@@M8@@@@A@@@@A@@@A@@@@@@@@@A@@@@8b@@8d@@@@@@@@@@@@@@@@M[\n" +
				"tNZ@@K@@@d@@@@A@@@@@8@@@/4N@@8@b@@d@@M@8@MK@M8@K@@@@@@d@@@@@@@@[\n" +
				"M/KA8@@@MA@@@M@@@@@@@@@@[|t*Z@N@@@@8@@M8ZAZZ@M@@@A@d@@@@@K@@@d@[\n" +
				"bYJ4M@@@@@@A@@@@@@@@@@@@D.\\'(YKKZD@8dK@5A84YZ@dM@@@@@@@@@@@@d@@[\n" +
				"K5dM8@8d@d@@@@@@@@8@@@@@@..-!/))ZK5AK4)AY(/XY/Z@@@A@@@d@@@M@@@@[\n" +
				"Y8dNA@@AK@@d@@@b@@@@@@@@@L,-,\\!]]\\X(5)Z/7c\\\\t5/K@@@@@@@@b@@@@@@[\n" +
				"8M8@@@A@@@A@@8@@@@@@@@@KDLt! !,-|t'(-\\\\!,\\/,\\!ZJG@@@d@Md@@@G@@@[");
		pw.flush();
	}
}