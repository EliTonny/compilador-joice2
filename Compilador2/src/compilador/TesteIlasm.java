import br.org.ilasm.IlasmBuilder;
import br.org.ilasm.exception.BuildException;

public class TesteIlasm {
	
	/**
	 * Teste do projeto ilasm-builder
	 * @param args
	 * @throws BuildException
	 * @throws Exception
	 */
	public static void aaaaaaaa() throws BuildException, Exception {
		/**
		 * atribuir Localiza��o do .exe do Ilasm
		 */
		IlasmBuilder.setPathFileIlasm("C:\\Windows\\Microsoft.NET\\Framework\\v4.0.30319\\ilasm.exe");
		
		/**
		 * Lugar onde se encontra o arquivo � compilar com o ilasm.exe
		 */
		IlasmBuilder.setPathFileBuild("C:\\Temp\\");
		
		/**
		 * Metodo que pergunta a localiza��o do ilasm.exe e o local do arquivo � compilar por ele
		 */
		IlasmBuilder.buildAndExecuteAsking();
		
		/**
		 * M�todo que criar o .exe e executa o .exe gerado
		 */
		IlasmBuilder.buildAndExecute();
		
		/**
		 * M�todo que criar o .exe
		 */
                IlasmBuilder.build();
		
		/**
		 * M�todo que pergunta qual a localiza��o do ilasm.exe, j� passando por par�metro o arquivo � compilar.
		 */
		IlasmBuilder.buildAskingIlasm("C:\\Users\\mmgsilva\\Desktop\\teste.obj.txt");
	}
}
