package cn.hengyan.day17;

public interface Interface1 {//�ӿ��ǳ������ͣ��ǳ��󷽷��ļ��ϡ�
	public void call() ;//�ڽӿ������еķ������ǳ��󷽷���
	//���Ĭ�Ͼ���abstract���������п��Բ���abstract
	//�������п�����abstract������Ҳ��������ͨ����
	public abstract int read(int i);
	public int x=3;//�ӿ��п��Զ��������������������Ǵ���ھ�̬���ڣ��ұ����ʼ��
	//��ʵ�ʿ����У��������û�����壬��Ϊ������ھ�̬�����Ҳ��ɸı䣬�൱��static final����
	//�������п��Զ������������ͨ��һ����
	public default void Practise1() {//JDK1.8�Ժ�������
		//default���εķ������÷������Բ���ʵ������ʵ�֣��������������չ��	
	};	
}//�ӿ�����ȫ���ǳ��󷽷�������û��ʵ��������
//һ��ʵ�ֽӿڵ��࣬����ʵ�ֽӿ������еĳ��󷽷������򣬾ͱ�������Ϊ�����ࡣ


 class InterfaceTest implements Interface1{
	//ע�⣬�ؼ�����implements��������extends�����ԽӶ���ӿ�
		//��������͸���Ĺ�ϵ�����Ǳ����ϲ������ֹ�ϵ
		@Override
		public void call() {//�ӿ��з�default���εķ�����������д��ʵ�֣�
			// TODO Auto-generated method stub
			
		}

		@Override
		public int read(int i) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}