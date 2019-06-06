import java.util.List;
import Models.Game;
import Models.Result;

public class CsvFoosballDal implements IFoosballDal{
	
	private String _csvGameFilePath;
	private String _loadedGameData;
	
	public CsvFoosballDal(String csvGamePath)
	{
		_csvGameFilePath = csvGamePath;
		_loadedGameData = ReadAllText();
	}
	
	private String ReadAllText() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Game> GetGames()
	{
		return null;
	}
	public Game  GetGame(int gameId){
		return null;}
	public void Insert(Game game){}
	public void SetGameResult(int gameId, Result reulult){}
	public void SetIsGameOver(int gameId, boolean isOver){}
	public void DeleteGame(int gameId){}
	
}
