package main;

import java.util.HashMap;
import java.util.Map;

public class PercentualFaturmento {

	public static void main(String[] args) {
		Map<String, Double> faturamentoEstados = new HashMap<>();
        faturamentoEstados.put("SP", 67836.43);
        faturamentoEstados.put("RJ", 36678.66);
        faturamentoEstados.put("MG", 29229.88);
        faturamentoEstados.put("ES", 27165.48);
        faturamentoEstados.put("Outros", 19849.53);

        
        double faturamentoTotal = faturamentoEstados.values().stream().mapToDouble(Double::doubleValue).sum();

        
        for (Map.Entry<String, Double> entry : faturamentoEstados.entrySet()) {
            String estado = entry.getKey();
            double valor = entry.getValue();
            double percentual = (valor / faturamentoTotal) * 100;
            System.out.printf("Percentual de representação de %s: %.2f%%%n", estado, percentual);
	}
	}
}
