// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> sk=new Stack<>();
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')sk.push(s.charAt(i));
//             else{
//                 if(!sk.isEmpty()){
//                 char temp = sk.pop();
//                 if(s.charAt(i)==')'&&temp!='(')return false;
//                 if(s.charAt(i)=='}'&&temp!='{')return false;
//                 if(s.charAt(i)==']'&&temp!='[')return false;
//                 }
//                 else return false;
//             }
//         }
//         if(!sk.isEmpty())return false;
//         return true;
        
//     }
// }
//这种压入反向括号的思想很不错，但是运行时间不如我自己写的短，可能是因为toCharArray这个方法比较浪费时间吧，需要深入了解java之后才知道原因
class Solution{
public boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}
}