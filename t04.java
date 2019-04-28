import java.util.*; 
class Solution{
	public ArrayList<String> restoreIpAddress(String s){ 
		ArrayList<String> res=new ArrayList<String>(); 
		String ip="";
		restoreIpAddress(s,0,0,ip,res);
		return res;
		}
	private void restoreIpAddress(String s,int start,int part,String ip, ArrayList<String> res){
		//数字多，则忽略 
		if(s.length() -start >(4-part)*3) return;
		//数字太少也忽略 
		if(s.length()-start <(4-part)) return; 
		//找到一个合法的ip 
		if(start==s.length() && part ==4) {
			//把最后一个抹去
			res.add(ip.substring(0,ip.length()-1));
			return;
			} 
		int num =0; 
		for(int i=start;i<Math.min(start+3,s.length());i++){ 
			//每个位置有三种可能 
			num = num*10 +(s.charAt(i)-'0');
			if(num<=255){ 
				//每段ip地址的数字都是小于256
				ip+=s.charAt(i); 
				restoreIpAddress(s,i+1,part+1,ip+'.',res); } 
			//如果第一个是0的话，只考虑0，不考虑0x组成的地址 
			if(num==0) 
				break;
			}
		} 
			
		
	}


