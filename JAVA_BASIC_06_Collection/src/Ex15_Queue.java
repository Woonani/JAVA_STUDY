import java.util.LinkedList;
import java.util.Queue;
import kr.or.kosa.Message;

public class Ex15_Queue {

	public static void main(String[] args) {
	
		Queue<Message> messageQueue = new LinkedList<Message>();
		// ���Լ���(FIFO) <> ���Լ���(LIFO)
		// �޼����� ������.
		
		// ȫ�浿, ȫ�漭, ȫ�泲���� ������� ������.
		// offer �� �ִ°� poll�� ���°�
		// �л����(������û, )
		messageQueue.offer(new Message("sendMail","ȫ�浿"));		
		messageQueue.offer(new Message("sendSMS","ȫ�漭"));		
		messageQueue.offer(new Message("sendKakaotalk","ȫ�泲"));
		
		while(!messageQueue.isEmpty()){
			Message message = messageQueue.poll();
			
			switch(message.command){
				
				case "sendMail" :
					System.out.println(message.to + "�Կ��� ������ �����ϴ�.");	
					break;
				
				case "sendSMS" :			
					System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");				
					break;
				
				case "sendKakaotalk" :				
					System.out.println(message.to + "�Կ��� ī���� �����ϴ�.");				
					break;
				
			}
		
		}
		
	}

}