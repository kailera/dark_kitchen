@Service

public class DarkKitchenService{
  private final DarkKitchenRepository darkKitchenRepository;

  @Autowired
  public DarkKitchenService(DarkKitchenRepository darkKitchenRepository){
    this.darkKitchenRepository = darkKitchenRepository;
  }

  public List <DarkKitchen> findDarkKitchenByRangeArea (double minArea, double maxArea){
    return darkKitchenRepository.findByArea(minArea, maxArea);
  }
