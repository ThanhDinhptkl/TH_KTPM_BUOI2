public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Tình huống 1: Theo dõi giá cổ phiếu
        Stock appleStock = new Stock("Apple", 150.0);
        Investor investorA = new Investor("Nguyễn Văn A");
        Investor investorB = new Investor("Trần Thị B");

        appleStock.attach(investorA);
        appleStock.attach(investorB);

        appleStock.setPrice(155.0);
        appleStock.setPrice(160.0); 

        // Tình huống 2: Theo dõi trạng thái công việc
        Task projectTask = new Task("Phát triển API", "Chưa bắt đầu");
        TeamMember member1 = new TeamMember("Hoàng");
        TeamMember member2 = new TeamMember("Lan");

        projectTask.attach(member1);
        projectTask.attach(member2);

        projectTask.setStatus("Đang thực hiện"); 
        projectTask.setStatus("Hoàn thành"); 
    }
}