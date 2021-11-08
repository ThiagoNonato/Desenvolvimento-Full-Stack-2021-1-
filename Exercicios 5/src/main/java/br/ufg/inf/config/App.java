package br.ufg.inf.config;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.ufg.inf.ctrl.HospedagemCtrl;
import br.ufg.inf.ctrl.HospedeCtrl;
import br.ufg.inf.ctrl.HotelCtrl;
import br.ufg.inf.ctrl.QuartoCtrl;
import br.ufg.inf.entities.Hospedagem;
import br.ufg.inf.entities.Hospede;
import br.ufg.inf.entities.Hotel;
import br.ufg.inf.entities.Quarto;
import br.ufg.inf.enums.CategoriaQuarto;

public class App {
    public static void main( String[] args ) {
        testarConexaoComBancoDeDados();
    }

    // public static void testarHospedagemDao() {
    //     System.out.println("Inicio");

    //     HospedagemCtrl hospedagemCtrl = new HospedagemCtrl();

    //     // testarHospedagemFindAll(hospedagemCtrl);

    //     // testarHospedagemFindById(hospedagemCtrl, 1);

    //     // QuartoCtrl quartoCtrl = new QuartoCtrl();
    //     // Quarto quarto = quartoCtrl.findById(6);
    //     // HospedeCtrl hospedeCtrl = new HospedeCtrl();
    //     // Hospede hospede = hospedeCtrl.findById(3);
    //     // Date dtCheckin = converterStirngEmDateSql("22/08/2021");
    //     // Date dtCheckout = converterStirngEmDateSql("05/09/2021");
    //     // Hospedagem h = new Hospedagem(quarto, hospede, dtCheckin, dtCheckout);
    //     // testarHospedagemInserir(hospedagemCtrl, h);

    //     // Hospedagem h = hospedagemCtrl.findById(3);
    //     // Date dtCheckout = converterStirngEmDateSql("12/09/2021");
    //     // h.setDtCheckout(dtCheckout);
    //     // testarHospedagemUpdate(hospedagemCtrl, h);

    //     testarHospedagemDelete(hospedagemCtrl, 4);

    //     System.out.println("Fim");
    // }

    // public static void testarHospedagemFindAll(HospedagemCtrl hospedagemCtrl) {
    //     List<Hospedagem> hospedagens = hospedagemCtrl.findAll();

    //     for (Hospedagem hospedagem : hospedagens) {
    //         System.out.println(hospedagem.toString());
    //     }
    // }

    // public static void testarHospedagemFindById(HospedagemCtrl hospedagemCtrl, Integer id) {
    //     Hospedagem hospedagem = hospedagemCtrl.findById(id);

    //     System.out.println(hospedagem.toString());
    // }

    // public static void testarHospedagemInserir(HospedagemCtrl hospedagemCtrl, Hospedagem h) {
    //     Hospedagem hospedagem = hospedagemCtrl.insert(h);

    //     System.out.println(hospedagem.toString());
    // }

    // public static void testarHospedagemUpdate(HospedagemCtrl hospedagemCtrl, Hospedagem h) {
    //     Hospedagem hospedagem = hospedagemCtrl.update(h);

    //     System.out.println(hospedagem.toString());
    // }

    // public static void testarHospedagemDelete(HospedagemCtrl hospedagemCtrl, Integer id) {
    //     hospedagemCtrl.delete(id);
    // }






    // public static void testarHospedeDao() {
    //     System.out.println("Inicio");

    //     HospedeCtrl hospedeCtrl = new HospedeCtrl();

    //     // testarHospedeFindAll(hospedeCtrl);

    //     // testarHospedeFindById(hospedeCtrl, 2);

    //     // Date dtNascimento = converterStirngEmDateSql("05/05/2002");
    //     // Hospede h = new Hospede("Luffy", dtNascimento, 5);
    //     // testarHospedeInserir(hospedeCtrl, h);

    //     // Hospede h = hospedeCtrl.findById(1);
    //     // h.setNmHospede("Nami");
    //     // Date dtNascimento = converterStirngEmDateSql("03/07/2001");
    //     // h.setDtNascimento(dtNascimento);
    //     // testarHospedeUpdate(hospedeCtrl, h);

    //     // testarHospedeDelete(hospedeCtrl, 2);

    //     System.out.println("Fim");
    // }

    // public static void testarHospedeFindAll(HospedeCtrl hospedeCtrl) {
    //     List<Hospede> hospedes = hospedeCtrl.findAll();

    //     for (Hospede hospede : hospedes) {
    //         System.out.println(hospede.toString());
    //     }
    // }

    // public static void testarHospedeFindById(HospedeCtrl hospedeCtrl, Integer id) {
    //     Hospede hospede = hospedeCtrl.findById(id);

    //     System.out.println(hospede.toString());
    // }

    // public static void testarHospedeInserir(HospedeCtrl hospedeCtrl, Hospede h) {
    //     Hospede hospede = hospedeCtrl.insert(h);

    //     System.out.println(hospede.toString());
    // }

    // public static void testarHospedeUpdate(HospedeCtrl hospedeCtrl, Hospede h) {
    //     Hospede hospede = hospedeCtrl.update(h);

    //     System.out.println(hospede.toString());
    // }

    // public static void testarHospedeDelete(HospedeCtrl hospedeCtrl, Integer id) {
    //     hospedeCtrl.delete(id);
    // }






    // public static void testarQuartoDao() {
    //     System.out.println("Inicio");

    //     QuartoCtrl quartoCtrl = new QuartoCtrl();

    //     // testarQuartoFindAll(quartoCtrl);

    //     // testarQuartoFindById(quartoCtrl, 1);

    //     // HotelCtrl hotelCtrl = new HotelCtrl();
    //     // Hotel hotel = hotelCtrl.findById(2);
    //     // Quarto q = new Quarto(hotel, CategoriaQuarto.LUXO, 2, 2, 250.);
    //     // testarQuartoInserir(quartoCtrl, q);

    //     // Quarto q = quartoCtrl.findById(2);
    //     // q.setNrQuarto(5);
    //     // testarQuartoUpdate(quartoCtrl, q);

    //     // testarQuartoDelete(quartoCtrl, 7);
    // }

    // public static void testarQuartoFindAll(QuartoCtrl quartoCtrl) {
    //     List<Quarto> quartos = quartoCtrl.findAll();

    //     for (Quarto quarto : quartos) {
    //     System.out.println(quarto.toString());
    //     }
    // }

    // public static void testarQuartoFindById(QuartoCtrl quartoCtrl, Integer id) {
    //     Quarto quarto = quartoCtrl.findById(id);

    //     System.out.println(quarto.toString());
    // }

    // public static void testarQuartoInserir(QuartoCtrl quartoCtrl, Quarto q) {
    //     Quarto quarto = quartoCtrl.insert(q);

    //     System.out.println(quarto.toString());
    // }

    // public static void testarQuartoUpdate(QuartoCtrl quartoCtrl, Quarto h) {
    //     Quarto quarto = quartoCtrl.update(h);

    //     System.out.println(quarto.toString());
    // }

    // public static void testarQuartoDelete(QuartoCtrl quartoCtrl, Integer id) {
    //     quartoCtrl.delete(id);
    // }


    

    // public static void testarHotelDao() {
    //     System.out.println("Inicio");

    //     HotelCtrl hotelCtrl = new HotelCtrl();

    //     // testarHotelFindAll(hotelCtrl);

    //     // testarHotelFindById(hotelCtrl, 2);

    //     // Hotel h = new Hotel("Castle Host", "Inglaterra", 5);
    //     // testarHotelInserir(hotelCtrl, h);

    //     // Hotel h = hotelCtrl.findById(19);
    //     // h.setNmHotel("DigiHotel Master");
    //     // h.setEndereco("DigiWorld");
    //     // h.setQtdEstrelas(5);
    //     // testarHotelUpdate(hotelCtrl, h);

    //     //testarHotelDelete(hotelCtrl, 15);
        
    //     System.out.println("Fim");
    // }

    // public static void testarHotelFindAll(HotelCtrl hotelCtrl) {
    //     List<Hotel> hoteis = hotelCtrl.findAll();

    //     for (Hotel hotel : hoteis) {
    //         System.out.println(hotel.toString());
    //     }
    // }

    // public static void testarHotelFindById(HotelCtrl hotelCtrl, Integer id) {
    //     Hotel hotel = hotelCtrl.findById(id);

    //     System.out.println(hotel.toString());
    // }

    // public static void testarHotelInserir(HotelCtrl hotelCtrl, Hotel h) {
    //     Hotel hotel = hotelCtrl.insert(h);

    //     System.out.println(hotel.toString());
    // }

    // public static void testarHotelUpdate(HotelCtrl hotelCtrl, Hotel h) {
    //     Hotel hotel = hotelCtrl.update(h);

    //     System.out.println(hotel.toString());
    // }

    // public static void testarHotelDelete(HotelCtrl hotelCtrl, Integer id) {
    //     hotelCtrl.delete(id);
    // }






    public static void testarConexaoComBancoDeDados() {
        System.out.println("Inicio");

        EntityManager em = DaoFactory.getEm();

        //testarInserirHotel(em);
        testarPesquisarAllHotel(em);
        //testarPesquisarPorIdHotel(em, 14);
        //testarPesquisarPorCampoNomeHotel(em, "as");
        //testarPesquisarPorCampoQtdEstrelasHotel(em, 2);
        //testarEditarHotel(em, 16);
        //testarDeletarHotel(em, 14);

        System.out.println("Fim");
    }

    public static void testarInserirHotel(EntityManager em) {
        Hotel hotel = new Hotel("Denali Hotel", "Anápolis", 4);

        em.getTransaction().begin();
        em.persist(hotel);
        em.getTransaction().commit();
    }

    public static void testarPesquisarAllHotel(EntityManager em) {
        TypedQuery<Hotel> result = em.createQuery("FROM Hotel", Hotel.class);

        List<Hotel> hoteis = result.getResultList();
        
        for (Hotel hotel : hoteis) {
            System.out.println(hotel.toString());
        }
    }

    public static void testarPesquisarPorIdHotel(EntityManager em, Integer id) {
        Hotel hotel = em.find(Hotel.class, id);

        System.out.println(hotel.toString());
    }

    public static void testarPesquisarPorCampoNomeHotel(EntityManager em, String str) {
        String sql = "FROM Hotel h WHERE h.nmHotel LIKE :str";
        TypedQuery<Hotel> result = em.createQuery(sql, Hotel.class);
        result.setParameter("str", "%"+str+"%");

        List<Hotel> hoteis = result.getResultList();

        for (Hotel hotel : hoteis) {
            System.out.println(hotel.toString());
        }
    }

    public static void testarPesquisarPorCampoQtdEstrelasHotel(EntityManager em, Integer str) {
        String sql = "FROM Hotel h WHERE h.qtdEstrelas LIKE :str";
        TypedQuery<Hotel> result = em.createQuery(sql, Hotel.class);
        result.setParameter("str", str);

        List<Hotel> hoteis = result.getResultList();

        for (Hotel hotel : hoteis) {
            System.out.println(hotel.toString());
        }
    }

    public static void testarEditarHotel(EntityManager em, Integer id) {
        Hotel hotel = em.find(Hotel.class, id);
        hotel.setNmHotel("Castor");

        em.getTransaction().begin();
        em.persist(hotel);
        em.getTransaction().commit();
    }

    public static void testarDeletarHotel(EntityManager em, Integer id) {
        Hotel hotel = em.find(Hotel.class, id);

        em.getTransaction().begin();
        em.remove(hotel);
        em.getTransaction().commit();
    }

    public static java.sql.Date converterStirngEmDateSql(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        java.sql.Date dateSql = null;
        try {
            java.util.Date dateSDF = sdf.parse(dateStr);
            long ms = dateSDF.getTime();
            dateSql = new java.sql.Date(ms);

            return dateSql;
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}
