package demo;

import com.fun.frame.SourceCode;
import org.junit.Test;

public class Demo1 extends SourceCode {

    public static void main(String[] args) {

    }


    @Test
    public void testss() {
        output(3);
    }

    //    我有经验的，聪明的，受人尊敬的高级工程师见过的最糟糕的代码是：
    public String getResult(boolean flag) {
        String result = "fix";
        if (flag == true) {
            result = "pre" + result;
        }
        if (flag == false) {
            result = "post" + result;
        }
        return result;
    }

    //    最终结果是该代码返回“ prefix”或“ postfix”。
//    但是，第一个问题是当错误导致它在某些情况下返回错误的错误时出现。我在所有文件中都进行了“前缀”和“后缀”的代码搜索，但未标记此代码，因为从不显示确切的文本。
//
//    其他问题：如果
//    将标志与true进行比较，则将其作为布尔标志开始是多余的。
//    当应该使用else子句时，使用单独的if子句来处理替代条件是多余的。
//
//    总的来说，我认为它可能更像是这样写：

    public String getResult2(boolean flag) {
        return (flag ? "prefix" : "postfix");

    }

//    或对于那些不喜欢三元运算符的人（老实说，如果您对某种语言的原语不满意，那么您就不应该使用该语言！），例如：

//    清晰，可搜索，明确，简短！
//    最重要的是，当有人使用代码搜索工具查找“前缀”的所有实例时，他们将不会像原始代码那样获得“零结果发现”。
}
