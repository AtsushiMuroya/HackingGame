class StartUp{
  public static void main(String[] args) {

    int gameCount;
    Title title = new Title();
    Level level = new Level();
    Question question = new Question();

    //タイトル画面表示
    title.display();

    //レベル選択画面
    level.display();

    gameCount = level.gameCount();
    question.display(gameCount);
  }
}
