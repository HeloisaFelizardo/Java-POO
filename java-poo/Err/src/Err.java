//Retorna um objeto definido pelo programador
public class Err {
	String msg; // mensagem de erro
	int severity; // indicando a gravidade do erro

	Err(String m, int s) {
		msg = m;
		severity = s;
	}
}

class ErrorInfo {
	String msgs[] = { "Output Error", "Input Error", "Disk Full", "Index Out-Of-Bounds" };
	int howbad[] = { 3, 3, 2, 4 };

	Err getErrorInfo(int i) { // Retorna um objeto do tipo Err
		if (i >= 0 & i < msgs.length)
			return new Err(msgs[i], howbad[i]);
		else
			return new Err("Invalid Error Code", 0);
	}
}
