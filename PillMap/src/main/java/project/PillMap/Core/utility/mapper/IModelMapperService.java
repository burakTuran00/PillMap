package project.PillMap.Core.utility.mapper;
import org.modelmapper.ModelMapper;
public interface IModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();
}
