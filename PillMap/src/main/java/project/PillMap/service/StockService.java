package project.PillMap.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import project.PillMap.Core.utility.mapper.ModelMapperService;
import project.PillMap.dto.StockDto;
import project.PillMap.model.Stock;
import project.PillMap.repository.StockRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class StockService {

    private final StockRepository stockRepository;
    private final ModelMapperService modelMapperService;

    public StockService(StockRepository stockRepository, ModelMapperService modelMapperService) {
        this.stockRepository = stockRepository;
        this.modelMapperService = modelMapperService;
    }

    public ResponseEntity<List<StockDto>> getAll() {
        List<Stock> stocks = stockRepository.findAll();
        List<StockDto> dtos = new ArrayList<>();

        if(!stocks.isEmpty()){
            for(Stock stock : stocks){
                dtos.add(modelMapperService.forResponse().map(stock, StockDto.class));
            }
        }

        return ResponseEntity.ok(dtos);
    }

    public ResponseEntity<List<StockDto>> getById(int id) {
        List<Stock> stocks = stockRepository.findAllById(Collections.singleton(id));
        List<StockDto> dtos = new ArrayList<>();

        if(!stocks.isEmpty()){
            for(Stock stock : stocks){
                dtos.add(modelMapperService.forResponse().map(stock, StockDto.class));
            }
        }

        return ResponseEntity.ok(dtos);
    }

    public ResponseEntity<List<StockDto>> getByPharmacyId(int id) {
       List<Stock> stocks = stockRepository.findStocksByPharmacyId(id);
       List<StockDto> dtos = new ArrayList<>();

       if(!stocks.isEmpty()){
           for(Stock stock: stocks){
               dtos.add(modelMapperService.forResponse().map(stock, StockDto.class));
           }
       }
       return ResponseEntity.ok(dtos);
    }

    public ResponseEntity<List<StockDto>> getByMedicationId(int id) {
        List<Stock> stocks = stockRepository.findStocksByMedicationId(id);
        List<StockDto> dtos = new ArrayList<>();

        if(!stocks.isEmpty()){
            for(Stock stock: stocks){
                dtos.add(modelMapperService.forResponse().map(stock, StockDto.class));
            }
        }
        return ResponseEntity.ok(dtos);
    }
}
