public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Sử dụng hệ thống cũ
        LegacyXMLSystem oldSystem = new LegacyXMLSystem();

        // Dùng Adapter để chuyển đổi XML -> JSON
        XMLJSONAdapter adapter = new XMLJSONAdapter(oldSystem);
        String jsonData = adapter.getConvertedJSON();
        
        System.out.println("Dữ liệu JSON sau khi chuyển đổi:");
        System.out.println(jsonData);

        // Chuyển đổi ngược lại JSON -> XML
        String xmlData = adapter.convertToXML(jsonData);
        System.out.println("\nDữ liệu XML sau khi chuyển đổi ngược:");
        System.out.println(xmlData);
    }
}