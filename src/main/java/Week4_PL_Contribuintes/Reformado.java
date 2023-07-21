package Week4_PL_Contribuintes;

public class Reformado extends Contribuinte{
    /**
     * Taxa a aplicar sobre o rendimento proveniente do trabalho
     */
    private final float taxaSobreRT = 1f;
    /**
     * Taxa a aplicar sobre o rendimento proveniente de outras fontes
     */
    private final float taxaSobreOR = 3f;

    /**
     * Construtor de Contribuinte reformado
     * @param nome nome do contribuinte
     * @param morada morada do contribuinte
     * @param outrosRendimentos montante proveninete de outras fontes
     * @param rendimentoTrabalho montante proveniente do trabalho desempenhado pelo contribuinte
     */
    public Reformado(String nome, String morada, float outrosRendimentos, float rendimentoTrabalho){
        super(nome, morada, rendimentoTrabalho, outrosRendimentos);
    }
    /**
     * Construtor Contribuinte reformado com todos os atributos por omissão
     */
    public Reformado(){
        super();
    }
    /**
     * Calcula o valor do imposto a pagar pelo contribuinte reformado
     * @return soma dos produtos entre os montantes (proveninetes do trabalho e outras fontes) pelas respetivas taxas a aplicar
     */
    @Override
    public float calcularValorImposto() {
        return getRendimentoTrabalho() * (taxaSobreRT/100) + getOutrosRendimentos() * (taxaSobreOR/100);
    }
    /**
     * Informação acerca do contribuinte desempregado
     * @return string informativa acerca do contribuinte (nome, morada, montante proveniente do trabalho, montante proveniente de outras fontes e o valor a pagar de imposto)
     */
    @Override
    public String toString() {
        return super.toString() + "está reformado e imposto a ser pago totaliza = " +
                calcularValorImposto() +
                " euros!";
    }
}
