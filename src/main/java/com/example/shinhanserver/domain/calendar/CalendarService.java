package com.example.shinhanserver.domain.calendar;

import com.example.shinhanserver.domain.PB.PB;
import com.example.shinhanserver.domain.PB.PBService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CalendarService {

  private final CalendarRepository calendarRepository;
  private final PBService pbService;

  @Transactional
  public CalendarResponseDto addSchedule(CalendarRequestDto request, Long pbId) {

    PB pb = pbService.findPBById(pbId);

    Calendar calendar = Calendar.builder()
            .pb(pb)
            .date(request.getDate())
            .time(request.getTime())
            .schedule(request.getSchedule())
            .build();

    return new CalendarResponseDto(calendarRepository.save(calendar));
  }

}