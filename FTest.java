package cn.hengyan.day39;

import java.util.ArrayList;
import java.util.List;

public class FTest {
	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add("sss");
	//	li.add(34);//���Ϸ��ͺ󣬾Ͳ��ܷ������ˣ�ֻ�ܷŷ��͹涨������
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
			String s1=(String)li.get(i);
			System.out.println(s1);			
		}
		
		List<Integer> li2=new ArrayList<>();
		li2.add(100);
		li2.add(344);
		System.out.println(li.getClass().getName());
		System.out.println(li2.getClass().getName());
		
	}
}//�����ĳ�����ȡȥ���ͻ��Ĵ�ʩ���������ڱ���֮��Ͳ������ˡ�����ֻ�ڱ���׶���Ч���ڱ�������У���ȷ��֤��
//���ͽ���Ժ󣬻Ὣ���͵������Ϣ���������������ͽ�����뿪�����ı߽紦��������ͼ�������ת���ķ�����Ҳ����˵��
//������Ϣ������뵽����ʱ�׶Ρ�
//�������Ϳ������߼��Ͽ����Ƕ����ͬ�����ͣ�ʵ���϶�����ͬ�Ļ������͡�
