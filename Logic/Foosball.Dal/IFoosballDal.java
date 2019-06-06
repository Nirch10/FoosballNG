import java.util.List;
import Models.Game;
import Models.Result;

public interface IFoosballDal {
	//Returns list of all games saved in DB
	List<Game> GetGames();
	//Gets game id . returns all details of the selected game
	Game  GetGame(int gameId);
	//gets a game and inserrt it to DB
	void Insert(Game game);
	//Gets game id, andits  result - and update it
	void SetGameResult(int gameId, Result reulult);
	//Gets game id, and if the game is over - and saves it to DB
	void SetIsGameOver(int gameId, boolean isOver);
	//Deletes the game with gameId
	void DeleteGame(int gameId);
}
