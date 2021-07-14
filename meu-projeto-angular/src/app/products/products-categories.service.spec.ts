import { TestBed } from '@angular/core/testing';

import { ProductsCaategoriesService } from './products-categories.service';

describe('ProductsCaategoriesService', () => {
  let service: ProductsCaategoriesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProductsCaategoriesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
