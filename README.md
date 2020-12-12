# JunitLesson
# 課題
以下のクラスに対するJUnitのテストを作ってください
- CalculatorServiceImpl
- CalculatorController
- CustomExceptionHandler

# 実施手順
各クラスのテストクラスを実装してください。
実装ができたら自分のブランチを作ってpushしてください。
ブランチ名はtopic/junit-test_{yourname}のようにしてください。
e.g. topic/junit-test_zarlihnin
pushができたらmasterへのPRを作って小山にReviewを依頼してください。
PRは間違ってマージしないようにタイトルにWIPをつけてください。

# ヒント
ControllerのテストではMockMvcを使ってください。
Controllerで使用するCalculatorServiceはMockitoを使ってモックにしてください。
ExceptionHandlerのテストはCalculatorControllerのテストとして実施しても大丈夫です。
